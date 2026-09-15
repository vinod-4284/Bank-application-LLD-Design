package com.project.vinodSB;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/userOP")
public class User_operation {
    //create a map for store user
    private Map<Integer, User> userDB = new HashMap<>();

    @PostMapping
    public ResponseEntity<User> create_user(@RequestBody User user) {
        userDB.putIfAbsent(user.getId(), user);
//        return "user created";
//        return ResponseEntity.status(HttpStatus.CREATED).body("User crested");
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<String> update_user(@RequestBody User user) {
        if(userDB.containsKey(user.getId())) {
            userDB.put(user.getId(), user);
//            return "User updated";
//            return new ResponseEntity<>("User Updated", HttpStatus.UPGRADE_REQUIRED);
//            return ResponseEntity.ok("User Updated");
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("User Updated");
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Not Found");
    }

    @GetMapping
    public ResponseEntity<List<User>> get_users() {
        List<User> users = new ArrayList<>(userDB.values());
        return new ResponseEntity<>(users, HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete_user(@PathVariable int id) {
        if(!userDB.containsKey(id)) {
//            return "User not found";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found");
        }
        userDB.remove(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("User Deleted");
    }
}

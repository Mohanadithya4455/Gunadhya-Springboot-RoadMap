package com.example.socialmedia_backend.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chat {
          @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Integer id;
         private String chat_name;
         private String profile_pic;
         private LocalDateTime time;
         @ManyToMany
         private List<User> users = new ArrayList<>();


}

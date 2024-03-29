package com.anyday.database.models;

import jakarta.persistence.*;
import java.util.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "USER_TBL")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  private String firstName;
  private String lastName;

  @Column(unique = true)
  private String email;

  @OneToMany(mappedBy = "user_id")
  private List<Journal> journals;
}

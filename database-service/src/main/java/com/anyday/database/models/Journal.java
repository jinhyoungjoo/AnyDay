package com.anyday.database.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Data
@NoArgsConstructor
@Entity
@Table(name = "JOURNAL_TBL")
public class Journal {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @ManyToOne
  @JoinColumn(name = "USER_ID", unique = true, nullable = false)
  private User user_id;

  @Column(length = 256)
  @ColumnDefault("Untitled")
  private String title;

  @Column(length = 50000)
  private String content;
}

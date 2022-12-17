package org.bedu.api.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "modules")
public class Module {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Temporal(TemporalType.DATE)
  @Column(name = "begin_date", nullable = false)
  private Date beginDate;

  @Column(name = "created_at")
  @CreatedDate
  private Date createdAt;

  @Column(name = "updated_at")
  @LastModifiedDate
  private Date updatedAt;

  @ManyToOne
  @JoinColumn(name = "course_id", referencedColumnName = "id", nullable = false)
  private Course course;
}

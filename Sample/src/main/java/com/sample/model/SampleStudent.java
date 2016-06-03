package com.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sample_student")
public class SampleStudent 
{
   @Id
   @Column(name="id")
   private Long id;
}

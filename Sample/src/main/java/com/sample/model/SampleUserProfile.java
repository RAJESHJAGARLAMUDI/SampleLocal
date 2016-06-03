package com.sample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="sample_user_profile")
public class SampleUserProfile implements Serializable
{
	@Id
	@Column(name="id")
	private Integer id;

}

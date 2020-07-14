package br.com.bill;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "User")
public class User extends PanacheEntity{

	@NotNull
	@Column
	public String name;
}

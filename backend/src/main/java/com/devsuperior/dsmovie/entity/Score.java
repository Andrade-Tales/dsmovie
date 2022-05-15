package com.devsuperior.dsmovie.entity;

import javax.persistence.EmbeddedId;	
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "tb_score")
public class Score {

	@EmbeddedId
	private ScorePK id = new ScorePK();
	private Double value;

	public Score() {
	}

	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}

	public void setUser(User user) {
		id.setUser(user);
	}

	/**
	 * @return the id
	 */
	public ScorePK getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ScorePK id) {
		this.id = id;
	}

	/**
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}

}

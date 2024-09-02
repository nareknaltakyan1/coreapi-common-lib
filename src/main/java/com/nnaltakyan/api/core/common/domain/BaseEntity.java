package com.nnaltakyan.api.core.common.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity
{

	@Column(name = "created", nullable = false, updatable = false)
	private Instant created;

	@Column(name = "updated", nullable = false)
	private Instant updated;

	@Column(name = "deleted")
	private Instant deleted;

	@PrePersist
	protected void onCreate()
	{
		Instant now = Instant.now();
		this.created = now;
		this.updated = now;
	}

	@PreUpdate
	protected void onUpdate()
	{
		this.updated = Instant.now();
	}
}

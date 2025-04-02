package com.bs.practice.generics.model.vo;

import java.util.Objects;

public class Farm {
	private String kind;
	
	public Farm() {
		// TODO Auto-generated constructor stub
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kind);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Farm other = (Farm) obj;
		return Objects.equals(kind, other.kind);
	}

	@Override
	public String toString() {
		return "Farm [kind=" + kind + "]";
	}

	public Farm(String kind) {
		super();
		this.kind = kind;
	}
	
	
}

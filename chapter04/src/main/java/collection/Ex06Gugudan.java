package collection;

import java.util.Objects;

public class Ex06Gugudan {
	private int left;
	private int right;
	
	public Ex06Gugudan(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return "Gugudan [left=" + left + ", right=" + right + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(left*right);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex06Gugudan other = (Ex06Gugudan) obj;
		return left*right == other.left * other.right;
	}
}
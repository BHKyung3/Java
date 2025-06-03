package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
	}

}

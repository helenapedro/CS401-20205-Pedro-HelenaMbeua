package labs.lab13.prob2;

import java.util.*;

public class GroupUtil {
	//Fix this code
//	public static Group<?> copy(Group<?> group) {
//		List<?> elements = group.getElements();
//		Group<?> grp = new Group<?>(group.getSpecialElement(), elements);
//		return grp;
//	}
    public static Group<?> copy(Group<?> group) {
        return copyHelper(group);
    }

    private static <T> Group<T> copyHelper(Group<T> group) {
        // defensive copy of the list to avoid aliasing
        List<T> elementsCopy = new ArrayList<>(group.getElements());
        return new Group<>(group.getSpecialElement(), elementsCopy);
    }

    //Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
	}
}

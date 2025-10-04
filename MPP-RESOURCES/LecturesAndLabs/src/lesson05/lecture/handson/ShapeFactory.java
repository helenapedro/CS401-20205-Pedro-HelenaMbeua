package LecturesAndLabs.src.lesson05.lecture.handson;

public class ShapeFactory {
    public static Shape getShape(String type)  {
        if (type.equals("Circle"))
            return new Circle();
        return null;
    }
}

public class GeometricFigures {

    public static void main(String[] args) {
        public class GeometricFigures {
            private double perimeter;
            private double area;
            private String fillColor;
            private String borderColor;
            public GeometricFigures(double perimeter, double area, String fillColor, String borderColor) {
                this.perimeter = perimeter;
                this.area = area;
                this.fillColor = fillColor;
                this.borderColor = borderColor;
            }

            public class Rectangle {
                private double length;
                private double width;

                public Rectangle(double length, double width) {
                    this.length = length;
                    this.width = width;
                }

            }

            public class Triangle {
                private double side1;
                private double side2;
                private double side3;

                public Triangle(double side1, double side2, double side3) {
                    this.side1 = side1;
                    this.side2 = side2;
                    this.side3 = side3;
                }

            }
            public class Circle {
                private double radius;

                public Circle(double radius) {
                    this.radius = radius;
                }

            }

        }
        public interface Figure {
            double calculatePerimeter();
            double calculateArea();

            default double calculatePerimeter() {
                return 0.0;
            }
        }
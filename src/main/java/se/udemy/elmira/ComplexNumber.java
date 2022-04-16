package se.udemy.elmira;

public class ComplexNumber {

        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }
        public double getReal() {
            return this.real;
        }
        public double getImaginary() {
            return this.imaginary;
        }
        public void add(double real, double imaginary) {
            this.real += real ;
            this.imaginary += imaginary;
        }
        public void add(ComplexNumber complexNumber) {
            this.imaginary += complexNumber.getImaginary();
            this.real += complexNumber.getReal();
        }
        public void subtract(double real, double imaginary) {
            this.real -= real;
            this.imaginary -= imaginary;
        }
        public void subtract(ComplexNumber other) {
            this.real -= other.getReal();
            this.imaginary -= other.getImaginary();
        }
    }


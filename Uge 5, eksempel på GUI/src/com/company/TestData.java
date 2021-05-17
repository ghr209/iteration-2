package com.company;

public class TestData {
    private String TestSvar;
    private String Mutation;


    public TestData( String TestSvar, String Mutation) {

        this.TestSvar = TestSvar;
        this.Mutation = Mutation;
    }
    public String getTestSvar() {
        return TestSvar;
    }
    public void setTestSvar(String TestSvar) {
        this.TestSvar = TestSvar;
    }

    public String getMutation() {
        return Mutation;
    }
    public void setMutation(String Mutation) {
        this.Mutation = Mutation;
    }

    @Override
    public String toString() {
        return "TestData{" +
                ", TestSvar='" + TestSvar + '\'' +
                ", Mutation='" + Mutation + '\'' +
                '}';
    }
}





class Paper {
    private int height;
    private int width;

    Paper(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("A");
        return this == obj;
    }

    //Overload
    public boolean equals(Paper p) {
        System.out.println("B");
        return this == p;
    }
}


 class multiple12 {
    public static void main(String[] args) {
        Image img = new Image();
        Video vid = new Video();

        img.display();
        vid.display();
        vid.play();
    }
}
interface DisplayInterface {
    void display();
}

interface PlayInterface {
    void play();
}

class Image implements DisplayInterface {
    @Override
    public void display() {
        System.out.println("This function is for displaying the image");
    }
}

class Video implements DisplayInterface, PlayInterface {
    @Override
    public void display() {
        System.out.println("This function is for displaying the video");
    }

    @Override
    public void play() {
        System.out.println("This function is for playing the video");
    }
}


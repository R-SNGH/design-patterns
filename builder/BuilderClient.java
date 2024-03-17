package designpatterns.builder;

public class BuilderClient {
    public static void main(String[] args) {
        PopStar hozier = new PopStar.PopStarBuilder().builder()
                .setCountry("Ireland")
                .setEmailId("hozier@hotmail.com")
                .setName("Hozier")
                .setId("H37863725")
                .build();
        System.out.println(hozier);
    }
}

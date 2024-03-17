package designpatterns.builder;

public class PopStar {
    private final String id;
    private final String name;
    private final String country;
    private final String emailId;

    private PopStar(PopStarBuilder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.country=builder.country;
        this.emailId=builder.emailId;
    }

    static class PopStarBuilder{
        private  String id;
        private  String name;
        private  String country;
        private  String emailId;

        public PopStarBuilder setId(String id) {
            this.id=id;
            return this;
        }

        public PopStarBuilder setName(String name) {
            this.name=name;
            return this;
        }

        public PopStarBuilder setCountry(String country) {
            this.country=country;
            return this;
        }

        public PopStarBuilder setEmailId(String emailId) {
            this.emailId=emailId;
            return this;
        }

        public PopStarBuilder(){
        }

        public static PopStarBuilder builder(){
            return new PopStarBuilder();
        }
        public PopStar build(){
            PopStar popStar =new PopStar(this);
            return popStar;
        }

    }

    @Override
    public String toString() {
        return "PopStar{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}

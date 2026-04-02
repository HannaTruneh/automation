package designpatterns.adapter;

class Traveler  {
    public static void main(String[] args) {
        // יצירת מכשיר אלקטרוני
        MobilePhone device = new MobilePhone();

        // יצירת מתאם יוניברסלי
        UniversalAdapter adapter = new UniversalAdapter(device);

        // חיבור המכשיר והטענה
        adapter.request();
    }
}

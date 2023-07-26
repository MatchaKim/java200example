package p28to80;

public class p32 {

    public static void main(String[] args) {
        double lati = 37.2;
        double longi = 126;
        double lati2 = 23.322;
        System.out.println(lati + lati2);
        double[] lating1 = {lati, longi};
        double[][] lating2 = {{lati, longi}, {lati2, longi}};
        System.out.println(lating1[0]);
        System.out.println(lating2[0][1]);
    }

    //배열은 참조타입이다. 배열은 new로 생성하는 동적할당배열과 new 를 사용하지 않는 정적 할당 배열이 있다
//    //정적할당 배열은 두번째 대입을 할 수 없다
//    double[] ㅣating ={33,24.5};
//    lating={36.4,54.44}
//    배열은 컴퓨터 프로그래밍에서 데이터를 저장하고 접근하기 위해 사용하는 중요한 데이터 구조입니다. 자바에서는 배열을 참조타입(reference type)으로 취급합니다. 참조타입이란 객체의 메모리 주소를 참조하는 타입을 말합니다.
//
//    자바에서 배열을 생성하면, 배열에 대한 참조가 만들어지고, 이 참조는 배열이 저장되어 있는 메모리 공간을 가리킵니다. 이 참조를 변수에 할당할 수 있습니다.
//
//    배열을 생성하는 방법에는 두 가지가 있습니다. new 키워드를 사용하는 동적 할당과 new를 사용하지 않는 정적 할당입니다.
//
//    동적 할당에서는 new 키워드를 사용하여 배열을 생성하고, 배열의 크기를 명시적으로 지정해줍니다. 예를 들면, int[] myArray = new int[5];과 같이 표현됩니다.
//
//    정적 할당에서는 new 키워드를 사용하지 않고, 배열을 생성하며 초기값을 지정해줍니다. 예를 들면, int[] myArray = {1, 2, 3, 4, 5};과 같이 표현됩니다.
//
//            그런데, 정적 할당으로 생성한 배열에 대해서는 새로운 배열을 할당하는 것이 불가능합니다. 즉, 위에서 생성한 myArray에 대해 myArray = {6, 7, 8, 9, 10};과 같이 새로운 배열을 할당할 수 없습니다.
//
//    이는 자바에서의 배열 할당 규칙으로, 처음 배열을 생성할 때 정적 할당을 사용하면, 나중에 다른 배열을 할당하려면 new 키워드를 사용하여 동적 할당해야 합니다.
//
//    따라서 위의 코드에서 double[] lating = {33,24.5}; 라인에서 lating이라는 이름의 배열이 생성되었지만, lating={36.4,54.44} 라인에서 새로운 배열을 할당하려고 하면 컴파일 오류가 발생합니다. 다시 배열을 할당하려면 lating = new double[]{36.4,54.44}와 같이 new 키워드를 사용해야 합니다.

}
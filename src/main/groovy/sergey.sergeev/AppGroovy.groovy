package sergey.sergeev

class AppGroovy {
    static def list = [1, 3, 4, 5, 1, 5, 4]


    static void main(String[] args) {
        println(getElements(list))
    }

    static Map<Integer, Integer> getElements(List<Integer> list) {
        def countMap = [:]
        list.each {
            element ->
                if (countMap.containsKey(element)) {
                    countMap[element]++
                } else {
                    countMap[element] = 1
                }
        }
        return countMap as Map<Integer, Integer>
    }
}

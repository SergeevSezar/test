package sergeev.sergey

def list = [1, 3, 4, 5, 1, 5, 4]
def countMap = [:]

list.each { element ->
    if (countMap.containsKey(element)) {
        countMap[element]++
    } else {
        countMap[element] = 1
    }
}
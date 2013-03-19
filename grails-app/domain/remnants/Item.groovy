package remnants

class Item {
    String name
    String description
    Boolean lugable
    ItemTemplate template

    static hasMany = [compatibleItems:Item, contains:Item]
    static belongsTo = [game:GameConfig]

    static constraints = {
        name blank: false
        description blank: false, maxSize: 2048
        template nullable: false
    }

    String toString(){
        name
    }
}

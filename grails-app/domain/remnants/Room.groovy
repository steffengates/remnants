package remnants

class Room {
    String name
    String description
    Boolean hidden = false
    RoomTemplate template

    static hasMany = [exits:Room, items:Item]
    static belongsTo = [game:GameConfig]

    static constraints = {
        description maxSize: 2048
    }

    String toString(){
        name
    }
}

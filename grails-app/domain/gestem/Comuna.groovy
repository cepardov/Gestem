package gestem

class Comuna {
    String code
    String name

    static hasMany = [sostenedor:Sostenedor, direccion:Direccion]
    static belongsTo = [ciudad:Ciudad]

    static constraints = {
    }
}

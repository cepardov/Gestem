package gestem

class Educacion {
    String code
    String name
    String fRes
    String description
    Boolean enable

    static hasMany = [asignatura:Asignatura]
    static belongsTo = [institucion:Institucion]

    static constraints = {
        fRes blank:true, nullable: true
        description blank:true, nullable: true
        enable blank:true, nullable: true
    }
}

package hello.hellospring.domain;

import jakarta.persistence.*;

@Entity
public class Member {

    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //db가 알아서 생성해주는 것
    private Long id; //시스템이 정하는 id

    @Column(name = "name") //
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}

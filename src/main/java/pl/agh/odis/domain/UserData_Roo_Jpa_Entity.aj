// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package pl.agh.odis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import pl.agh.odis.domain.UserData;

privileged aspect UserData_Roo_Jpa_Entity {
    
    declare @type: UserData: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long UserData.id;
    
    @Version
    @Column(name = "version")
    private Integer UserData.version;
    
    public Long UserData.getId() {
        return this.id;
    }
    
    public void UserData.setId(Long id) {
        this.id = id;
    }
    
    public Integer UserData.getVersion() {
        return this.version;
    }
    
    public void UserData.setVersion(Integer version) {
        this.version = version;
    }
    
}
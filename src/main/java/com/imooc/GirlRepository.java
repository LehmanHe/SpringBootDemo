package com.imooc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by lehman on 17/11/3.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    public List<Girl> findGirlsByAge();

    @Modifying
    @Query(value = "update girl set cupSize=?1 where id=?2",nativeQuery = true)
    int updateGirlById(String cupSize, Integer userId);
}

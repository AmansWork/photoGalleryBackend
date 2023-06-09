package com.game.gallery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.gallery.bean.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, String> {

}

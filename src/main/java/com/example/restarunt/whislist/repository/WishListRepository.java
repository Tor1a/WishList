package com.example.restarunt.whislist.repository;

import com.example.restarunt.db.MemoryDbRepositoryAbstract;
import com.example.restarunt.whislist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {

}

package edu.hi.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hi.shop.dto.ItemImg;





public interface ItemImgRepository extends JpaRepository<ItemImg, Long> {
    List<ItemImg> findByItemIdOrderByIdAsc(Long itemId);
    ItemImg findByItemIdAndRepimgYn(Long itemId, String repimgYn);
}

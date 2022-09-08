package edu.hi.shop.dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import edu.hi.shop.entity.ItemImg;



@Getter @Setter
public class ItemImgDto {

    private Long id;

    private String imgName;

    private String oriImgName;

    private String imgUrl;

    private String repImgYn;

    private static ModelMapper modelMapper = new ModelMapper();

    public static ItemImgDto of(ItemImg itemImg) {
        return modelMapper.map(itemImg,ItemImgDto.class);
    }

}
package edu.hi.shop.dto;

import java.util.ArrayList;
import java.util.List;

import edu.hi.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter 
@Setter
public class ItemFormDto {

    private Long id;

    @NotBlank(message = "상품명은 필수 입력 값입니다.")
    private String itemNm;

    @NotNull(message = "가격은 필수 입력 값입니다.")
    private Integer price;

    @NotBlank(message = "상품 상세는 필수 입력 값입니다.")
    private String itemDetail;

    @NotNull(message = "재고는 필수 입력 값입니다.")
    private Integer stockNumber;

    private ItemSellStatus itemSellStatus;

    //private List<ItemImgDto> itemImgDtoList = new ArrayList<>();

    private List<Long> itemImgIds = new ArrayList<>();

    //private static ModelMapper modelMapper = new ModelMapper();

    //public Item createItem(){
    //    return modelMapper.map(this, Item.class);
    //}

    //public static ItemFormDto of(Item item){
    //    return modelMapper.map(item,ItemFormDto.class);
    //}

}
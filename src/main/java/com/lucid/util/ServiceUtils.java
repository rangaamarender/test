package com.lucid.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Map;

public class ServiceUtils {

    public static final String SORT ="sort";
    public  static final  String PAGE = "page";
    public static final String SIZE="size";
    public static final String ASC = "asc";

    public static boolean isNullOrEmpty(String value){
        return value == null || value.replaceAll(" ", "").isEmpty();
    }
    public static Pageable getPageableObject(Map<String,Object> data){
        int defaultPage =0;
        int defaultSize =100;
        Sort defaultSort = null;
        if(data.containsKey(PAGE) && (Integer)data.get(PAGE) >0){
            defaultPage = (Integer)data.get(PAGE)-1;
        }
        if(data.containsKey(SIZE) && (Integer)data.get(SIZE) >0){
            if(!((Integer)data.get(SIZE) >defaultSize)){
                defaultSize = (Integer)data.get(SIZE);
            }
        }
        if(data.containsKey(SORT) && data.get(SORT) != null && !isNullOrEmpty((String)data.get(SORT))){
            String[] splitSortObject= ((String) data.get(SORT)).split("'");
            String sortBy = splitSortObject[0];
            Sort.Direction direction;
            if(splitSortObject[1].equalsIgnoreCase(ASC)){
                direction = Sort.Direction.ASC;
            }
            else{
                direction = Sort.Direction.DESC;
            }
            defaultSort=Sort.by(direction,sortBy);
        }
        if(defaultSort != null) {
            return PageRequest.of(defaultPage, defaultSize, defaultSort);
        }
        else {
            return PageRequest.of(defaultPage, defaultSize);
        }
    }

}

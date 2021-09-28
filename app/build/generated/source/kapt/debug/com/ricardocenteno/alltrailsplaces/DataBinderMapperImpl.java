package com.ricardocenteno.alltrailsplaces;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ricardocenteno.alltrailsplaces.databinding.FragmentPlaceListBindingImpl;
import com.ricardocenteno.alltrailsplaces.databinding.FragmentPlacesBindingImpl;
import com.ricardocenteno.alltrailsplaces.databinding.ItemSelectedPlaceBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTPLACELIST = 1;

  private static final int LAYOUT_FRAGMENTPLACES = 2;

  private static final int LAYOUT_ITEMSELECTEDPLACE = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ricardocenteno.alltrailsplaces.R.layout.fragment_place_list, LAYOUT_FRAGMENTPLACELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ricardocenteno.alltrailsplaces.R.layout.fragment_places, LAYOUT_FRAGMENTPLACES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ricardocenteno.alltrailsplaces.R.layout.item_selected_place, LAYOUT_ITEMSELECTEDPLACE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTPLACELIST: {
          if ("layout/fragment_place_list_0".equals(tag)) {
            return new FragmentPlaceListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_place_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLACES: {
          if ("layout/fragment_places_0".equals(tag)) {
            return new FragmentPlacesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_places is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSELECTEDPLACE: {
          if ("layout/item_selected_place_0".equals(tag)) {
            return new ItemSelectedPlaceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_selected_place is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "fragment");
      sKeys.put(2, "place");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_place_list_0", com.ricardocenteno.alltrailsplaces.R.layout.fragment_place_list);
      sKeys.put("layout/fragment_places_0", com.ricardocenteno.alltrailsplaces.R.layout.fragment_places);
      sKeys.put("layout/item_selected_place_0", com.ricardocenteno.alltrailsplaces.R.layout.item_selected_place);
    }
  }
}

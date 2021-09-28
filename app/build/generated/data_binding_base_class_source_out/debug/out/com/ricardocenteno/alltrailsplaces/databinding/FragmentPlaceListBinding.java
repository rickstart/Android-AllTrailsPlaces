// Generated by data binding compiler. Do not edit!
package com.ricardocenteno.alltrailsplaces.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ricardocenteno.alltrailsplaces.R;
import com.ricardocenteno.alltrailsplaces.view.fragments.PlaceListFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPlaceListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvPlaces;

  @Bindable
  protected PlaceListFragment mFragment;

  protected FragmentPlaceListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rvPlaces) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvPlaces = rvPlaces;
  }

  public abstract void setFragment(@Nullable PlaceListFragment fragment);

  @Nullable
  public PlaceListFragment getFragment() {
    return mFragment;
  }

  @NonNull
  public static FragmentPlaceListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_place_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlaceListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlaceListBinding>inflateInternal(inflater, R.layout.fragment_place_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlaceListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_place_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlaceListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlaceListBinding>inflateInternal(inflater, R.layout.fragment_place_list, null, false, component);
  }

  public static FragmentPlaceListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentPlaceListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPlaceListBinding)bind(component, view, R.layout.fragment_place_list);
  }
}
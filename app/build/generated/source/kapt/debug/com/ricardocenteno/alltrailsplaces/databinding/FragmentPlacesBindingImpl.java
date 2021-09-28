package com.ricardocenteno.alltrailsplaces.databinding;
import com.ricardocenteno.alltrailsplaces.R;
import com.ricardocenteno.alltrailsplaces.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlacesBindingImpl extends FragmentPlacesBinding implements com.ricardocenteno.alltrailsplaces.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(4, 
            new String[] {"item_selected_place"},
            new int[] {5},
            new int[] {com.ricardocenteno.alltrailsplaces.R.layout.item_selected_place});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.ricardocenteno.alltrailsplaces.databinding.ItemSelectedPlaceBinding mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlacesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentPlacesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (android.widget.FrameLayout) bindings[4]
            , (androidx.fragment.app.FragmentContainerView) bindings[2]
            , (androidx.fragment.app.FragmentContainerView) bindings[1]
            );
        this.btnView.setTag(null);
        this.layoutPlace.setTag(null);
        this.listPlaces.setTag(null);
        this.mapPlaces.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (com.ricardocenteno.alltrailsplaces.databinding.ItemSelectedPlaceBinding) bindings[5];
        setContainedBinding(this.mboundView4);
        setRootTag(root);
        // listeners
        mCallback1 = new com.ricardocenteno.alltrailsplaces.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        mboundView4.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView4.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView4.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFragmentPageState((androidx.databinding.ObservableField<com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment.PageState>) object, fieldId);
            case 1 :
                return onChangeViewModelPlaceSelected((androidx.databinding.ObservableField<com.ricardocenteno.alltrailsplaces.model.domain.model.Place>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFragmentPageState(androidx.databinding.ObservableField<com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment.PageState> FragmentPageState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPlaceSelected(androidx.databinding.ObservableField<com.ricardocenteno.alltrailsplaces.model.domain.model.Place> ViewModelPlaceSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.graphics.drawable.Drawable fragmentPageStatePageStateMAPBtnViewAndroidDrawableIcListBtnViewAndroidDrawableIcMap = null;
        boolean fragmentPageStatePageStateMAP = false;
        com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment fragment = mFragment;
        boolean fragmentPageStatePageStateLIST = false;
        boolean fragmentPageStatePageStateMAPViewModelPlaceSelectedJavaLangObjectNullBooleanFalse = false;
        int fragmentPageStatePageStateMAPViewModelPlaceSelectedJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment.PageState> fragmentPageState = null;
        int fragmentPageStatePageStateLISTViewVISIBLEViewGONE = 0;
        com.ricardocenteno.alltrailsplaces.model.domain.model.Place viewModelPlaceSelectedGet = null;
        int fragmentPageStatePageStateMAPViewVISIBLEViewGONE = 0;
        java.lang.String fragmentPageStatePageStateMAPBtnViewAndroidStringListBtnViewAndroidStringMap = null;
        boolean viewModelPlaceSelectedJavaLangObjectNull = false;
        com.ricardocenteno.alltrailsplaces.viewmodels.PlacesViewModel viewModel = mViewModel;
        com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment.PageState fragmentPageStateGet = null;
        androidx.databinding.ObservableField<com.ricardocenteno.alltrailsplaces.model.domain.model.Place> viewModelPlaceSelected = null;

        if ((dirtyFlags & 0x1fL) != 0) {



                if (fragment != null) {
                    // read fragment.pageState
                    fragmentPageState = fragment.getPageState();
                }
                updateRegistration(0, fragmentPageState);


                if (fragmentPageState != null) {
                    // read fragment.pageState.get()
                    fragmentPageStateGet = fragmentPageState.get();
                }


                // read fragment.pageState.get() == PageState.MAP
                fragmentPageStatePageStateMAP = (fragmentPageStateGet) == (com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment.PageState.MAP);
            if((dirtyFlags & 0x15L) != 0) {
                if(fragmentPageStatePageStateMAP) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x1fL) != 0) {
                if(fragmentPageStatePageStateMAP) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }

            if ((dirtyFlags & 0x15L) != 0) {

                    // read fragment.pageState.get() == PageState.MAP ? @android:drawable/ic_list : @android:drawable/ic_map
                    fragmentPageStatePageStateMAPBtnViewAndroidDrawableIcListBtnViewAndroidDrawableIcMap = ((fragmentPageStatePageStateMAP) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnView.getContext(), R.drawable.ic_list)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnView.getContext(), R.drawable.ic_map)));
                    // read fragment.pageState.get() == PageState.MAP ? View.VISIBLE : View.GONE
                    fragmentPageStatePageStateMAPViewVISIBLEViewGONE = ((fragmentPageStatePageStateMAP) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read fragment.pageState.get() == PageState.MAP ? @android:string/list : @android:string/map
                    fragmentPageStatePageStateMAPBtnViewAndroidStringListBtnViewAndroidStringMap = ((fragmentPageStatePageStateMAP) ? (btnView.getResources().getString(R.string.list)) : (btnView.getResources().getString(R.string.map)));
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    // read fragment.pageState.get() == PageState.LIST
                    fragmentPageStatePageStateLIST = (fragmentPageStateGet) == (com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment.PageState.LIST);
                if((dirtyFlags & 0x15L) != 0) {
                    if(fragmentPageStatePageStateLIST) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read fragment.pageState.get() == PageState.LIST ? View.VISIBLE : View.GONE
                    fragmentPageStatePageStateLISTViewVISIBLEViewGONE = ((fragmentPageStatePageStateLIST) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x1aL) != 0) {



                if (viewModel != null) {
                    // read viewModel.placeSelected
                    viewModelPlaceSelected = viewModel.getPlaceSelected();
                }
                updateRegistration(1, viewModelPlaceSelected);


                if (viewModelPlaceSelected != null) {
                    // read viewModel.placeSelected.get()
                    viewModelPlaceSelectedGet = viewModelPlaceSelected.get();
                }
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {



                if (viewModel != null) {
                    // read viewModel.placeSelected
                    viewModelPlaceSelected = viewModel.getPlaceSelected();
                }
                updateRegistration(1, viewModelPlaceSelected);


                if (viewModelPlaceSelected != null) {
                    // read viewModel.placeSelected.get()
                    viewModelPlaceSelectedGet = viewModelPlaceSelected.get();
                }


                // read viewModel.placeSelected.get() != null
                viewModelPlaceSelectedJavaLangObjectNull = (viewModelPlaceSelectedGet) != (null);
        }

        if ((dirtyFlags & 0x1fL) != 0) {

                // read fragment.pageState.get() == PageState.MAP ? viewModel.placeSelected.get() != null : false
                fragmentPageStatePageStateMAPViewModelPlaceSelectedJavaLangObjectNullBooleanFalse = ((fragmentPageStatePageStateMAP) ? (viewModelPlaceSelectedJavaLangObjectNull) : (false));
            if((dirtyFlags & 0x1fL) != 0) {
                if(fragmentPageStatePageStateMAPViewModelPlaceSelectedJavaLangObjectNullBooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read fragment.pageState.get() == PageState.MAP ? viewModel.placeSelected.get() != null : false ? View.VISIBLE : View.GONE
                fragmentPageStatePageStateMAPViewModelPlaceSelectedJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = ((fragmentPageStatePageStateMAPViewModelPlaceSelectedJavaLangObjectNullBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnView, fragmentPageStatePageStateMAPBtnViewAndroidStringListBtnViewAndroidStringMap);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableLeft(this.btnView, fragmentPageStatePageStateMAPBtnViewAndroidDrawableIcListBtnViewAndroidDrawableIcMap);
            this.listPlaces.setVisibility(fragmentPageStatePageStateLISTViewVISIBLEViewGONE);
            this.mapPlaces.setVisibility(fragmentPageStatePageStateMAPViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnView.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x1fL) != 0) {
            // api target 1

            this.mboundView4.getRoot().setVisibility(fragmentPageStatePageStateMAPViewModelPlaceSelectedJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.mboundView4.setPlace(viewModelPlaceSelectedGet);
        }
        executeBindingsOn(mboundView4);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragment
        com.ricardocenteno.alltrailsplaces.view.fragments.PlacesFragment fragment = mFragment;
        // fragment != null
        boolean fragmentJavaLangObjectNull = false;



        fragmentJavaLangObjectNull = (fragment) != (null);
        if (fragmentJavaLangObjectNull) {


            fragment.setPageState();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment.pageState
        flag 1 (0x2L): viewModel.placeSelected
        flag 2 (0x3L): fragment
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): fragment.pageState.get() == PageState.MAP ? @android:drawable/ic_list : @android:drawable/ic_map
        flag 6 (0x7L): fragment.pageState.get() == PageState.MAP ? @android:drawable/ic_list : @android:drawable/ic_map
        flag 7 (0x8L): fragment.pageState.get() == PageState.MAP ? viewModel.placeSelected.get() != null : false
        flag 8 (0x9L): fragment.pageState.get() == PageState.MAP ? viewModel.placeSelected.get() != null : false
        flag 9 (0xaL): fragment.pageState.get() == PageState.MAP ? viewModel.placeSelected.get() != null : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): fragment.pageState.get() == PageState.MAP ? viewModel.placeSelected.get() != null : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): fragment.pageState.get() == PageState.LIST ? View.VISIBLE : View.GONE
        flag 12 (0xdL): fragment.pageState.get() == PageState.LIST ? View.VISIBLE : View.GONE
        flag 13 (0xeL): fragment.pageState.get() == PageState.MAP ? View.VISIBLE : View.GONE
        flag 14 (0xfL): fragment.pageState.get() == PageState.MAP ? View.VISIBLE : View.GONE
        flag 15 (0x10L): fragment.pageState.get() == PageState.MAP ? @android:string/list : @android:string/map
        flag 16 (0x11L): fragment.pageState.get() == PageState.MAP ? @android:string/list : @android:string/map
    flag mapping end*/
    //end
}
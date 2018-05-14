package com.example.boyanyosifov.myapplication.databinding;
import com.example.boyanyosifov.myapplication.R;
import com.example.boyanyosifov.myapplication.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegisterBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.editText_City, 5);
        sViewsWithIds.put(R.id.editText_Country, 6);
        sViewsWithIds.put(R.id.editText_Adress, 7);
        sViewsWithIds.put(R.id.editText_Phone, 8);
    }
    // views
    @NonNull
    public final android.widget.Button buttonReg;
    @NonNull
    public final android.widget.EditText editTextAdress;
    @NonNull
    public final android.widget.EditText editTextCity;
    @NonNull
    public final android.widget.EditText editTextCountry;
    @NonNull
    public final android.widget.EditText editTextEmail;
    @NonNull
    public final android.widget.EditText editTextPasswordRegister;
    @NonNull
    public final android.widget.EditText editTextPhone;
    @NonNull
    public final android.widget.EditText editTextUsername;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private com.example.boyanyosifov.myapplication.com.online.shop.repository.User mNewuser;
    @Nullable
    private com.example.boyanyosifov.myapplication.IRegisterEvent mRegisterevent;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editTextEmailandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of newuser.address
            //         is newuser.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editTextEmail);
            // localize variables for thread safety
            // newuser
            com.example.boyanyosifov.myapplication.com.online.shop.repository.User newuser = mNewuser;
            // newuser.address
            java.lang.String newuserAddress = null;
            // newuser != null
            boolean newuserJavaLangObjectNull = false;



            newuserJavaLangObjectNull = (newuser) != (null);
            if (newuserJavaLangObjectNull) {




                newuser.setAddress(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener editTextPasswordRegisterandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of newuser.password
            //         is newuser.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editTextPasswordRegister);
            // localize variables for thread safety
            // newuser
            com.example.boyanyosifov.myapplication.com.online.shop.repository.User newuser = mNewuser;
            // newuser.password
            java.lang.String newuserPassword = null;
            // newuser != null
            boolean newuserJavaLangObjectNull = false;



            newuserJavaLangObjectNull = (newuser) != (null);
            if (newuserJavaLangObjectNull) {




                newuser.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener editTextUsernameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of newuser.username
            //         is newuser.setUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editTextUsername);
            // localize variables for thread safety
            // newuser
            com.example.boyanyosifov.myapplication.com.online.shop.repository.User newuser = mNewuser;
            // newuser.username
            java.lang.String newuserUsername = null;
            // newuser != null
            boolean newuserJavaLangObjectNull = false;



            newuserJavaLangObjectNull = (newuser) != (null);
            if (newuserJavaLangObjectNull) {




                newuser.setUsername(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityRegisterBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.buttonReg = (android.widget.Button) bindings[3];
        this.buttonReg.setTag(null);
        this.editTextAdress = (android.widget.EditText) bindings[7];
        this.editTextCity = (android.widget.EditText) bindings[5];
        this.editTextCountry = (android.widget.EditText) bindings[6];
        this.editTextEmail = (android.widget.EditText) bindings[4];
        this.editTextEmail.setTag(null);
        this.editTextPasswordRegister = (android.widget.EditText) bindings[2];
        this.editTextPasswordRegister.setTag(null);
        this.editTextPhone = (android.widget.EditText) bindings[8];
        this.editTextUsername = (android.widget.EditText) bindings[1];
        this.editTextUsername.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.newuser == variableId) {
            setNewuser((com.example.boyanyosifov.myapplication.com.online.shop.repository.User) variable);
        }
        else if (BR.registerevent == variableId) {
            setRegisterevent((com.example.boyanyosifov.myapplication.IRegisterEvent) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNewuser(@Nullable com.example.boyanyosifov.myapplication.com.online.shop.repository.User Newuser) {
        updateRegistration(0, Newuser);
        this.mNewuser = Newuser;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.newuser);
        super.requestRebind();
    }
    @Nullable
    public com.example.boyanyosifov.myapplication.com.online.shop.repository.User getNewuser() {
        return mNewuser;
    }
    public void setRegisterevent(@Nullable com.example.boyanyosifov.myapplication.IRegisterEvent Registerevent) {
        this.mRegisterevent = Registerevent;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.registerevent);
        super.requestRebind();
    }
    @Nullable
    public com.example.boyanyosifov.myapplication.IRegisterEvent getRegisterevent() {
        return mRegisterevent;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNewuser((com.example.boyanyosifov.myapplication.com.online.shop.repository.User) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNewuser(com.example.boyanyosifov.myapplication.com.online.shop.repository.User Newuser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.example.boyanyosifov.myapplication.com.online.shop.repository.User newuser = mNewuser;
        java.lang.String newuserUsername = null;
        java.lang.String newuserAddress = null;
        com.example.boyanyosifov.myapplication.IRegisterEvent registerevent = mRegisterevent;
        java.lang.String newuserPassword = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (newuser != null) {
                    // read newuser.username
                    newuserUsername = newuser.getUsername();
                    // read newuser.address
                    newuserAddress = newuser.getAddress();
                    // read newuser.password
                    newuserPassword = newuser.getPassword();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.buttonReg.setOnClickListener(mCallback3);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextEmail, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextEmailandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextPasswordRegister, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextPasswordRegisterandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextUsername, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextUsernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextEmail, newuserAddress);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextPasswordRegister, newuserPassword);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextUsername, newuserUsername);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // registerevent != null
        boolean registereventJavaLangObjectNull = false;
        // registerevent
        com.example.boyanyosifov.myapplication.IRegisterEvent registerevent = mRegisterevent;



        registereventJavaLangObjectNull = (registerevent) != (null);
        if (registereventJavaLangObjectNull) {


            registerevent.onClickRegister();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityRegisterBinding>inflate(inflater, com.example.boyanyosifov.myapplication.R.layout.activity_register, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.boyanyosifov.myapplication.R.layout.activity_register, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityRegisterBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegisterBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_register_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityRegisterBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): newuser
        flag 1 (0x2L): registerevent
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
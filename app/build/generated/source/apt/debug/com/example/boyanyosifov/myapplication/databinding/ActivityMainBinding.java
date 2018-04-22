package com.example.boyanyosifov.myapplication.databinding;
import com.example.boyanyosifov.myapplication.R;
import com.example.boyanyosifov.myapplication.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.widget.Button btnLogin;
    @NonNull
    public final android.widget.EditText editTextPassword;
    @NonNull
    public final android.widget.EditText editTextUsername;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.TextView tvRegister;
    // variables
    @Nullable
    private com.example.boyanyosifov.myapplication.IMainEvent mMainEvent;
    @Nullable
    private com.example.boyanyosifov.myapplication.com.online.shop.repository.User mUser;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editTextPasswordandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.password
            //         is user.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editTextPassword);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.example.boyanyosifov.myapplication.com.online.shop.repository.User user = mUser;
            // user.password
            java.lang.String userPassword = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener editTextUsernameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.username
            //         is user.setUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editTextUsername);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.example.boyanyosifov.myapplication.com.online.shop.repository.User user = mUser;
            // user.username
            java.lang.String userUsername = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setUsername(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.btnLogin = (android.widget.Button) bindings[1];
        this.btnLogin.setTag(null);
        this.editTextPassword = (android.widget.EditText) bindings[4];
        this.editTextPassword.setTag(null);
        this.editTextUsername = (android.widget.EditText) bindings[3];
        this.editTextUsername.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvRegister = (android.widget.TextView) bindings[2];
        this.tvRegister.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
        if (BR.mainEvent == variableId) {
            setMainEvent((com.example.boyanyosifov.myapplication.IMainEvent) variable);
        }
        else if (BR.user == variableId) {
            setUser((com.example.boyanyosifov.myapplication.com.online.shop.repository.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainEvent(@Nullable com.example.boyanyosifov.myapplication.IMainEvent MainEvent) {
        this.mMainEvent = MainEvent;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mainEvent);
        super.requestRebind();
    }
    @Nullable
    public com.example.boyanyosifov.myapplication.IMainEvent getMainEvent() {
        return mMainEvent;
    }
    public void setUser(@Nullable com.example.boyanyosifov.myapplication.com.online.shop.repository.User User) {
        updateRegistration(0, User);
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    @Nullable
    public com.example.boyanyosifov.myapplication.com.online.shop.repository.User getUser() {
        return mUser;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUser((com.example.boyanyosifov.myapplication.com.online.shop.repository.User) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUser(com.example.boyanyosifov.myapplication.com.online.shop.repository.User User, int fieldId) {
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
        java.lang.String userUsername = null;
        com.example.boyanyosifov.myapplication.IMainEvent mainEvent = mMainEvent;
        java.lang.String userPassword = null;
        com.example.boyanyosifov.myapplication.com.online.shop.repository.User user = mUser;

        if ((dirtyFlags & 0x5L) != 0) {



                if (user != null) {
                    // read user.username
                    userUsername = user.getUsername();
                    // read user.password
                    userPassword = user.getPassword();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(mCallback1);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextPassword, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextPasswordandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextUsername, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextUsernameandroidTextAttrChanged);
            this.tvRegister.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextPassword, userPassword);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextUsername, userUsername);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // mainEvent != null
                boolean mainEventJavaLangObjectNull = false;
                // mainEvent
                com.example.boyanyosifov.myapplication.IMainEvent mainEvent = mMainEvent;



                mainEventJavaLangObjectNull = (mainEvent) != (null);
                if (mainEventJavaLangObjectNull) {


                    mainEvent.onClickRegister();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // mainEvent != null
                boolean mainEventJavaLangObjectNull = false;
                // mainEvent
                com.example.boyanyosifov.myapplication.IMainEvent mainEvent = mMainEvent;



                mainEventJavaLangObjectNull = (mainEvent) != (null);
                if (mainEventJavaLangObjectNull) {


                    mainEvent.onClickLogin();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.boyanyosifov.myapplication.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.boyanyosifov.myapplication.R.layout.activity_main, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): mainEvent
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
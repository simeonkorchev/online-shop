
package android.databinding;
import com.example.boyanyosifov.myapplication.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.example.boyanyosifov.myapplication.R.layout.activity_main:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_main_0".equals(tag)) {
                            return new com.example.boyanyosifov.myapplication.databinding.ActivityMainBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                }
                case com.example.boyanyosifov.myapplication.R.layout.activity_product:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_product_0".equals(tag)) {
                            return new com.example.boyanyosifov.myapplication.databinding.ActivityProductBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_product is invalid. Received: " + tag);
                }
                case com.example.boyanyosifov.myapplication.R.layout.activity_register:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_register_0".equals(tag)) {
                            return new com.example.boyanyosifov.myapplication.databinding.ActivityRegisterBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_register is invalid. Received: " + tag);
                }
                case com.example.boyanyosifov.myapplication.R.layout.activity_store:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_store_0".equals(tag)) {
                            return new com.example.boyanyosifov.myapplication.databinding.ActivityStoreBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_store is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.example.boyanyosifov.myapplication.R.layout.activity_main;
                }
                break;
            }
            case 320357045: {
                if(tag.equals("layout/activity_product_0")) {
                    return com.example.boyanyosifov.myapplication.R.layout.activity_product;
                }
                break;
            }
            case 2013163103: {
                if(tag.equals("layout/activity_register_0")) {
                    return com.example.boyanyosifov.myapplication.R.layout.activity_register;
                }
                break;
            }
            case 1831119719: {
                if(tag.equals("layout/activity_store_0")) {
                    return com.example.boyanyosifov.myapplication.R.layout.activity_store;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"mainEvent"
            ,"newuser"
            ,"password"
            ,"registerevent"
            ,"user"
            ,"username"};
    }
}
package boxuegu.com.boxuegu.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import boxuegu.com.boxuegu.R;

public class AdBannerFragment extends Fragment {
    private int ab;//广告
    private ImageView iv; //图片
    public static AdBannerFragment newInstance(int args){
        AdBannerFragment af=new AdBannerFragment();
        af.ab=args;
        return af;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume(){
        super.onResume();
        iv.setImageResource(ab);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        if (iv!=null){
            iv.setImageDrawable(null);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        iv=new ImageView(getActivity());
        ViewGroup.LayoutParams lp=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,ViewGroup.LayoutParams.FILL_PARENT);
        iv.setLayoutParams(lp);
        iv.setScaleType(ImageView.ScaleType.FIT_XY);
        return iv;
    }
}

package com.bluedot.myabc;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter {
        Context context;
        LayoutInflater inflater;


    // list of images
        public int[] lst_images = {
                R.drawable.splashscreen,
                R.drawable.lettera,
                R.drawable.letterb,
                R.drawable.letterc,
                R.drawable.letterd,
                R.drawable.lettere,
                R.drawable.letterf,
                R.drawable.letterg,
                R.drawable.letterh,
                R.drawable.letteri,
                R.drawable.letterj,
                R.drawable.letterk,
                R.drawable.letterl,
                R.drawable.letterm,
                R.drawable.lettern,
                R.drawable.lettero,
                R.drawable.letterp,
                R.drawable.letterq,
                R.drawable.letterr,
                R.drawable.letters,
                R.drawable.lettert,
                R.drawable.letteru,
                R.drawable.letterv,
                R.drawable.letterw,
                R.drawable.letterx,
                R.drawable.lettery,
                R.drawable.letterz,
                R.drawable.splashscreen1
        };


        // list of titles
        public String[] lst_title = {
                "","","","","","","","","","","","","","","","","","","","","","","","","","","",""
               };

        // list of descriptions
        public String[] lst_description = {
                "","","","","","","","","","","","","","","","","","","","","","","","","","","",""
        };


        public SlideAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return lst_title.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return (view== object);
        }


        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            inflater = LayoutInflater.from(context);

            View view = inflater.inflate(R.layout.slide,container,false);
            LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout);
            ImageView imgslide = view.findViewById(R.id.slideimg);
            imgslide.setImageResource(lst_images[position]);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((LinearLayout)object);
        }
    }



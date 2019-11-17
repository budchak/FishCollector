package com.yaroshevich.fishcollector.ui.newTrophy;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.palette.graphics.Palette;

import com.yaroshevich.fishcollector.App;
import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.databinding.FragmentNewTrophyBinding;
import com.yaroshevich.fishcollector.navigation.AppNavigator;
import com.yaroshevich.fishcollector.ui.fragment.CollapsingToolbarFragment;

public class NewTrophyFragment extends CollapsingToolbarFragment {

    public static final int RESULT_PREVIEW = 0;

    public static final int RESULT_RV = 1;

    private static final int REQUEST_PERMISSIONS_CODE_WRITE_STORAGE = 555;

    private FragmentNewTrophyBinding binding;

    private Uri selectedImage;



    private GradientDrawable gd;

    private AppNavigator navigator;

    @Override
    public void onAttach(Context context) {
        setLogTag("New trophy fragment");
        super.onAttach(context);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        App.getInstance().initNewTrophyComponent(this).inject(this);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        navigator = AppNavigator.getInstance(null);
        binding = FragmentNewTrophyBinding.inflate(inflater, container, false);

        setContentView(binding.getRoot());

        getToolbarBuilder()
                .setBackButtonEnable(true)
                .setMenu(R.menu.menu_new_trophy)
                .setTitle("Новый трофей");
        return view;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_PERMISSIONS_CODE_WRITE_STORAGE) {

            if (permissions[0].equals(Manifest.permission.READ_EXTERNAL_STORAGE)
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                Intent galleryIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(galleryIntent, RESULT_RV);
            }
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (data != null) {

            switch (requestCode) {

                case RESULT_RV:
                    selectedImage = data.getData();

                    break;

                case RESULT_PREVIEW:
                    Uri Image = data.getData();

                    selectedImage = Image;

                    break;
            }
        }
    }


    public void createBackgroundColor(Bitmap bitmap) {
        int pix = bitmap.getPixel(0, bitmap.getHeight() - 1);

        Log.e("pix", " " + pix);

        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                int defaultValue = 0x000000;

                int vibrant = palette.getVibrantColor(defaultValue);

                int vibrantLight = palette.getLightVibrantColor(defaultValue);

                int vibrantDark = palette.getDarkVibrantColor(defaultValue);

                int muted = palette.getMutedColor(defaultValue);

                int mutedLight = palette.getLightMutedColor(defaultValue);

                int mutedDark = palette.getDarkMutedColor(defaultValue);

                int[] colors = {pix, getActivity().getResources().getColor(R.color.blueThemeToolbar)};

                gd = new GradientDrawable(
                        GradientDrawable.Orientation.TOP_BOTTOM, colors);

                int[] colors2 = {Color.parseColor("#00000000")
                        , Color.parseColor("#00000000")
                        , pix};

                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colors2);

                // binding.coordinator.setBackground(gd);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    //binding.trophyTitleImage.setForeground(gradientDrawable);
                }

                //binding.view.setBackground(gradientDrawable);

            }
        });

    }

    private void init() {
        NewTrophyHandler newTrophyHandler = new NewTrophyHandler(navigator);
        binding.setHandler(newTrophyHandler);
    }

    @Override
    public void onResume() {
        super.onResume();
        init();
    }
}

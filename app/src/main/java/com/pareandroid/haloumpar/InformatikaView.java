package com.pareandroid.haloumpar;

import com.pareandroid.haloumpar.Model.ModelTeknik;

import java.util.List;

public interface InformatikaView {

    void Showloading();
    void Hideloading();
    void Onresponse(List<ModelTeknik> modelTeknikList);
    void Onfailure(String localizedMessage);
}

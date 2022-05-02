package com.example.recipeapp.utils;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "recipe_id",
        "recipe_name",
        "image_url",
        "ingredients",
        "cooking_directions",
        "nutrition_info"
})
@Generated("jsonschema2pojo")
public class Recipe {

    @JsonProperty("recipe_id")
    private Integer recipeId;
    @JsonProperty("recipe_name")
    private String recipeName;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("ingredients")
    private String ingredients;
    @JsonProperty("cooking_directions")
    private String cookingDirections;
    @JsonProperty("nutrition_info")
    private String nutritionInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Recipe() {
    }

    /**
     *
     * @param recipeName
     * @param cookingDirections
     * @param nutritionInfo
     * @param imageUrl
     * @param ingredients
     * @param recipeId
     */
    public Recipe(Integer recipeId, String recipeName, String imageUrl, String ingredients, String cookingDirections, String nutritionInfo) {
        super();
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.imageUrl = imageUrl;
        this.ingredients = ingredients;
        this.cookingDirections = cookingDirections;
        this.nutritionInfo = nutritionInfo;
    }

    @JsonProperty("recipe_id")
    public Integer getRecipeId() {
        return recipeId;
    }

    @JsonProperty("recipe_id")
    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    @JsonProperty("recipe_name")
    public String getRecipeName() {
        return recipeName;
    }

    @JsonProperty("recipe_name")
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("ingredients")
    public String getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @JsonProperty("cooking_directions")
    public String getCookingDirections() {
        return cookingDirections;
    }

    @JsonProperty("cooking_directions")
    public void setCookingDirections(String cookingDirections) {
        this.cookingDirections = cookingDirections;
    }

    @JsonProperty("nutrition_info")
    public String getNutritionInfo() {
        return nutritionInfo;
    }

    @JsonProperty("nutrition_info")
    public void setNutritionInfo(String nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Recipe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recipeId");
        sb.append('=');
        sb.append(((this.recipeId == null)?"<null>":this.recipeId));
        sb.append(',');
        sb.append("recipeName");
        sb.append('=');
        sb.append(((this.recipeName == null)?"<null>":this.recipeName));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        sb.append("ingredients");
        sb.append('=');
        sb.append(((this.ingredients == null)?"<null>":this.ingredients));
        sb.append(',');
        sb.append("cookingDirections");
        sb.append('=');
        sb.append(((this.cookingDirections == null)?"<null>":this.cookingDirections));
        sb.append(',');
        sb.append("nutritionInfo");
        sb.append('=');
        sb.append(((this.nutritionInfo == null)?"<null>":this.nutritionInfo));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
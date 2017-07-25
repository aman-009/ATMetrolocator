package com.example.amanmehta.atmetrolocator;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by amanmehta on 25/07/17.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private static final String TAG = "ExpandableListAdapter";

    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> _listDataChild;

    public ExpandableListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, List<String>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
        Log.d(TAG, "ExpandableListAdapter: ========================");

    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        Log.e(TAG, "getChild: -----------------------------------");
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        Log.e(TAG, "getChildId: --------------------------------------------");
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.child_item, null);
        }

        TextView txtListChild = (TextView) convertView
                .findViewById(R.id.lblListItem);

        txtListChild.setText(childText);
        Log.e(TAG, "getChildView: )))))))))))))))))))))))))))))))))))))))))");
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        Log.e(TAG, "getChildrenCount: ++++++++++++++++++++++++++++++++++");
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        Log.e(TAG, "getGroup: ______________________________________");
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        Log.e(TAG, "getGroupView: ====================enter");
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.group_item, null);
        }

        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);
        Log.d(TAG, "getGroupView: -----------------end");
        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}

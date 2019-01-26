package com.example.contactapp;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
        public void btnAdd_Contact_onClick(View view){

            //intent
            Intent intent   = new Intent(ContactsContract.Intents.Insert.ACTION);
            intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);

            //get the entered data

            EditText mFirstname = (EditText) findViewById(R.id.txtFirstname);
            EditText mLastname = (EditText) findViewById(R.id.lastname);
            EditText mEmailAddress = (EditText) findViewById(R.id.Email);
            EditText mPhoneNumber = (EditText) findViewById(R.id.Telephone);



            //Insert Email data
            intent
                    .putExtra(ContactsContract.Intents.Insert.EMAIL, mEmailAddress.getText())
                    .putExtra(ContactsContract.Intents.Insert.EMAIL_TYPE, ContactsContract.CommonDataKinds.Email.TYPE_WORK)
                    .putExtra(ContactsContract.Intents.Insert.PHONE,mPhoneNumber.getText())
                    .putExtra(ContactsContract.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_HOME)
                    .putExtra(ContactsContract.Intents.Insert.NAME,mFirstname.getText() + " " + mLastname.getText())
            ;




            startActivity(intent);

        }
    }


#!/bin/bash

echo 'Moving docs in html folder'
cp -R docs html
echo 'Done...'

echo ' '

echo 'Generating HTML from markdowns'
cd html
npm run docs
rm -rf docs
mv ../docs ../_docs
mv _docs ../docs
cd ..
echo 'Done...'

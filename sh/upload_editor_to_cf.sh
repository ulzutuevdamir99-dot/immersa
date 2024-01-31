#!/bin/bash

rm -rf /Users/ertugrul/IdeaProjects/Immersa/resources/public/js/compiled

npm run release

current_timestamp=$(date +%s)000

INDEX_PATH='/Users/ertugrul/IdeaProjects/Immersa/resources/public/index.html'

sed -i '' "s/__COMMIT_SHA__/${current_timestamp}/g" ${INDEX_PATH}

npx wrangler pages deploy resources/public --project-name immersa-editor

sed -i '' "s/${current_timestamp}/__COMMIT_SHA__/g" ${INDEX_PATH}
